package com.example.myapplication1

class teamScores {
    var team_a_score:Int=0
    var team_b_score:Int=0

    fun addOne(team:String){
        when (team){
            "A"->team_a_score+=1
            "B"->team_b_score+=1
            else->"No team found"
        }
    }

    fun addTwo(team:String){
        when (team){
            "A"->team_a_score+=2
            "B"->team_b_score+=2
            else->"No team found"
        }
    }
    fun addThree(team:String){
        when (team){
            "A"->team_a_score+=3
            "B"->team_b_score+=3
            else->"No team found"
        }
    }

    fun getTotal(team:String):Int{
       return when (team){
            "A"->team_a_score
            "B"->team_b_score
            else->0
        }
    }



}