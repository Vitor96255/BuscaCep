package br.com.cepinspira.service

import br.com.cepinspira.wrapper.EnderecoWrapper
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.client.HttpClientErrorException.BadRequest
import org.springframework.web.client.RestTemplate


class CepService {
    fun buscaEndereco(@PathVariable(name = "cep") cep: String?): EnderecoWrapper? {
        val enderecoWrapper = EnderecoWrapper()
        return if (cep !== null && (cep.length !== 8) && enderecoWrapper.cep.isNullOrEmpty()){
            null
        } else {
            val uri = "http://viacep.com.br/ws/{cep}/json/"
            val restTemplate = RestTemplate()

            val map: MutableMap<String, String?> = HashMap()
            map["cep"] = cep
            val endereco: EnderecoWrapper? = restTemplate.getForObject(uri, EnderecoWrapper::class.java, map)
            endereco
        }
}}