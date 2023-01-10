package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

class MiniFloatingButton(
    private val miniIcon : IconBuilder,
    private val miniContainer : ContainerBuilder
) : FloatingButton() {
    override val icon: IconBuilder
        get() =miniIcon

    override val container: ContainerBuilder
        get() = miniContainer


}