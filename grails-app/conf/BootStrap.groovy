import kickerstats.Challenge
import kickerstats.Game
import kickerstats.Player
import kickerstats.Team

class BootStrap {

    def init = { servletContext ->

        def player1 = new Player(firstname: "Firstname1", lastname: "Lastname1").save(failOnError: true, validate: true)
        def player2 = new Player(firstname: "Firstname2", lastname: "Lastname2").save(failOnError: true, validate: true)
        def player3 = new Player(firstname: "Firstname3", lastname: "Lastname3").save(failOnError: true, validate: true)
        def player4 = new Player(firstname: "Firstname4", lastname: "Lastname4").save(failOnError: true, validate: true)

        def team1 = new Team(offence: player1, defence: player2).save(failOnError: true, validate: true)
        def team2 = new Team(offence: player3, defence: player4).save(failOnError: true, validate: true)

        def challenge = new Challenge().save(failOnError: true, validate: true)

        def game1 = new Game(challenge: challenge, winner: team1, looser: team2, loserScore: 5).save(failOnError: true, validate: true)
        def game2 = new Game(challenge: challenge, winner: team2, looser: team1, loserScore: 3).save(failOnError: true, validate: true)
        def game3 = new Game(challenge: challenge, winner: team1, looser: team2, loserScore: 4).save(failOnError: true, validate: true)
    }

    def destroy = {
    }
}
