val rockPlanets = arrayOf("Mercury" , "Venus" , "Earth" , " Mars")
val gasPlanets = arrayOf("Jupiter" , "Saturn" , " Uranus" , " Neptune")
val solarSystem = rockPlanets+ gasPlanets
fun main()
{
    val solarSystem = mutableMapOf(
        "Mercury" to 0 ,
        "Venus" to 0,
        "Earth" to 1,
        " Mars" to 2,
        "Jupiter" to 79
        , "Saturn" to 82
        , " Uranus" to 27
        , " Neptune" to 14)
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    solarSystem["Pluto"]=5
//    println(solarSystem.size)
//    println(solarSystem.get("Theia"))
//    for ( planet in solarSystem){
//        println(planet)
//    }
//    solarSystem.add("Pluto")
//    solarSystem.add(4,"Theia")
//    solarSystem[3] = "Future Moon"
//    println(solarSystem.contains("Pluto"))
//    println("Future Moon" in solarSystem)
//    println(solarSystem.size)
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))
//    println("Pluto" in solarSystem)
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))
}
