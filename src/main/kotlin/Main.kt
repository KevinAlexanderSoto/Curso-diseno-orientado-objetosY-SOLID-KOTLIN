import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder
import floatingActionsButtons.ExtendedFloatingButton
import floatingActionsButtons.FloatingButton
import floatingActionsButtons.MiniFloatingButton

fun main(args: Array<String>) {
    val extendedButton : FloatingButton = ExtendedFloatingButton()
    val miniButton : FloatingButton = MiniFloatingButton(IconBuilder(4,2321),ContainerBuilder(21,25,13))
}