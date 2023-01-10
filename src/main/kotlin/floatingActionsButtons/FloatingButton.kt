package floatingActionsButtons

import buttonBuilders.ContainerBuilder
import buttonBuilders.IconBuilder

abstract class FloatingButton (){
    abstract val icon : IconBuilder
    abstract  val container : ContainerBuilder
}