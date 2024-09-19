/*Exo 1*/
fun calculDefenseTotal(defense:Int, typeArmure:Int, qualite:Int): Int{
    val score= defense + typeArmure + qualite
    return score
}

/* Exo2*/
fun lanceDes(nbDes:Int, nbFaces:Int):Int{
    val result=(nbDes..nbFaces*nbDes).random()
    return result
}

/* Exo3*/
fun calculDegatArme(nbDes:Int, nbFaces:Int, qualiteArme:Int, activationCC:Int, multiplicateurCC:Int):Int{
    var result=lanceDes(nbDes,nbFaces)
    if (result>=activationCC){
        result=result*multiplicateurCC
    }

    result+=qualiteArme

    if (result<0){
        result=0
    }

    return result
}

/* Exo4*/
fun attaque(PV:Int, degatArme:Int, defTotal:Int, nomAttaquant:String, nomCible:String){
    var result= degatArme-defTotal

    if (result<0){
        result=0
    }

    var exPv=PV

    var nouveauPv=exPv - result

    if(nouveauPv<0){
        nouveauPv=0
    }

    var degatReel = exPv - nouveauPv

    return println("$nomAttaquant attaque $nomCible pour $degatReel point de dégâts")

}

/* Exo 5*/
fun boirePotion(nomPerso:String, nbPvPerso:Int, nbPvMaxPerso:Int, puissancePotion:Int){
    var ancienPv=nbPvPerso
    var NvPv=nbPvPerso+puissancePotion
    if (NvPv>nbPvMaxPerso){
        NvPv=nbPvMaxPerso
    }
    var PvRecuperer=NvPv-ancienPv
    return println("$nomPerso boit une potion et récupere $PvRecuperer PV")
}

fun main(){
    /* Exo 1
    print(calculDefenseTotal(3,2,1))
    assert(calculDefenseTotal(3,2, 1) == 6) {
        "Erreur la valeur obtenue est de ${calculDefenseTotal(3,2, 1)}"
    }*/

    /*Exo 2
    print(lanceDes(4,20))*/

    /* Exo 3
    print(calculDegatArme(2,4,2,10,2))*/

    /* Exo 4
    print(attaque(5,9,2,"Attaquant", "Cible"))*/

    /* Exo 5
    print(boirePotion("perso",18,20,6))*/

}