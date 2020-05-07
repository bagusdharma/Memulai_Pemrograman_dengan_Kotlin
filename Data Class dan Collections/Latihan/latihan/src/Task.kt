fun main() {

    // TODO 1
    val vehicle = mapOf(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("maxSpeed")
    val maxTank = vehicle.getValue("maxTank")

    // TODO 3
    println("Vehicle")
    println("Type: $type")
    println("Maximal Speed: $maxSpeed")
    println("Maximal Tank: $maxTank")

}