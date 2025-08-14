
@Composable
fun BebasNeueuFont() = FontFamily(
    Font(Res.font.bebas_neue_regular, FontWeight.Normal)
)

@Composable
fun RobotoCondensedFont() = FontFamily(
    Font(Res.font.roboto_condensed_mdeium)
)

object FontSize{
    val EXTRA_SMALL = 10.sp
    val SMALL = 12.sp
    val REGULAR = 14.sp
    val EXTRA_REGULAR = 16.sp
    val MEDIUM = 18.sp
    val EXTRA_MEDIUM = 20.sp
    val LARGE = 30.sp
    val EXTRA_LARGE = 40.sp
}