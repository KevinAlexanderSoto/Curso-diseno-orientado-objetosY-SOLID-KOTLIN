package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

class ExtendedFloatingButton(
    override var icon: IconBuilder = IconBuilder(4,2321),
    override var container: ContainerBuilder =ContainerBuilder(21,45,23),
    var label : String = "button"
) : FloatingButton(icon, container) {
}