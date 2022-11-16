package br.com.cepinspira.wrapper

class EnderecoWrapper {
    var cep: String? = null
    var logradouro: String? = null
    var complemento: String? = null
    var bairro: String? = null
    var cidade: String? = null
        private set
    var estado: String? = null
        private set

    fun setLocalidade(localidade: String?) {
        cidade = localidade
    }

    fun setUf(uf: String?) {
        estado = uf
    }
}
