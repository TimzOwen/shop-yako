package com.shopyako.data

import com.shopyako.data.domain.CustomerRepository
import com.timzowen.shopyako.shared.domain.Customer
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.FirebaseUser
import dev.gitlive.firebase.firestore.firestore

class CustomerRepositoryImpl: CustomerRepository {
    override suspend fun createCustomer(
        user: FirebaseUser?,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        try {
            if (user!=null){
                val customerCollection = Firebase.firestore.collection(collectionPath = "customer")
                val customer = Customer(
                    id = user.uid,
                    firstName = user.displayName?.split(" ")?.firstOrNull() ?: "unknown",
                    lastName = user.displayName?.split(" ")?.lastOrNull() ?: "unknown",
                    email = user.email ?: "unknown"
                )

                val customerExists = customerCollection.document(user.uid).get().exists

                if (customerExists){
                    onSuccess()
                }else{
                    customerCollection.document(user.uid).set(customer)
                    onSuccess()
                }

            }else{
                onError("Customer is null")
            }
        }catch (e: Exception){
            onError("Error creating customer: ${e.message}")
        }
    }
}