package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

class ExtendedFloatingButton(
   private var extendedIcon: IconBuilder = IconBuilder(4,2321),
   private var extendedContainer: ContainerBuilder =ContainerBuilder(21,45,23),
   private var label : String = "button"
) : FloatingButton() {
    override val icon: IconBuilder
        get() = extendedIcon
    override val container: ContainerBuilder
        get() = extendedContainer
}