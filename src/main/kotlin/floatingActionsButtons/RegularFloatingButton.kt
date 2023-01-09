package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

open class RegularFloatingButton(
    override var icon: IconBuilder = IconBuilder(4,2321),
    override var container: ContainerBuilder =ContainerBuilder(21,45,23)
) : FloatingButton(icon,container) {


}