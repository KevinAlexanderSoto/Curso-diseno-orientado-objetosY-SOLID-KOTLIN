package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

open class RegularFloatingButton(
    private val regularIcon : IconBuilder = IconBuilder(4,2321),
    private val regularContainer : ContainerBuilder = ContainerBuilder(21,45,23))
    : FloatingButton() {
    override var icon: IconBuilder = regularIcon
    override var container: ContainerBuilder = regularContainer

}
