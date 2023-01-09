package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

class MiniFloatingButton(
    override var icon: IconBuilder =  IconBuilder(4,2321),
    override var container: ContainerBuilder = ContainerBuilder(21,25,13)
) : FloatingButton(icon, container) {

}