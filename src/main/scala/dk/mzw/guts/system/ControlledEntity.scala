package dk.mzw.guts.system

import dk.mzw.guts.utility.{Keys, Mouse}

trait ControlledEntity extends Entity {

    def onInput(world : WorldEntity, keys: Keys, mouse : Mouse) : Unit

}
