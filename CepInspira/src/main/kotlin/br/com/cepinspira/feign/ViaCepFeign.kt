package br.com.cepinspira.feign

import br.com.cepinspira.response.ApiResponse
import br.com.cepinspira.wrapper.EnderecoWrapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

//@FeignClient(
//    name = "viaCep",
//    value = "viaCep",
//    url = "\"http://viacep.com.br/ws/{cep}/json/\""
//)
interface ViaCepFeign {
//    @GetMapping("/api/buscaCep{cep}")
//    fun buscaEndereco(@PathVariable cep: String) : ApiResponse<EnderecoWrapper>
}