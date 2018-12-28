package net.akehurst.game.flightsimulator.application.flight

import net.akehurst.game.flightsimulator.computational.simulator.Simulator

class FlightApplication(args : Array<String>) {

    private val simulator = Simulator()


    fun run() {
        simulator.start()
    }

}
