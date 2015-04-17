package kickerstats

class Player {

    String firstname, lastname, nickname

    static constraints = {
        firstname(nullable: false, blank: false)
        lastname(nullable: false, blank: false, unique: ['firstname'])
        nickname(nullable: true, unique: true)
    }
}
