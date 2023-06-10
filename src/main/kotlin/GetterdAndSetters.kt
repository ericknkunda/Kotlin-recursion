class GetterdAndSetters {
    private  var countryName:String? =""
        get() =field
        set(value) {
            this.countryName =value
        }

    private var countryPresident: String? =""
        get() = field
        set(value) {this.countryName =value}
}