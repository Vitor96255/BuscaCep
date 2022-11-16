package br.com.cepinspira.controller

import br.com.cepinspira.response.ApiResponse
import br.com.cepinspira.wrapper.EnderecoWrapper
import br.com.cepinspira.service.CepService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/cep")
//@Tag(name = "cep", description = "End-point de retornar endereco atragvés do Cep")

class CepController {

    @GetMapping("buscaCep/{cep}")
    @ApiOperation(value = "busca endereco")
    fun buscarEndereco(@PathVariable cep: String): ApiResponse<EnderecoWrapper> {
        val enderecoWrapper = EnderecoWrapper()

        val buscaCep = CepService().buscaEndereco(cep)
        return if (buscaCep?.cep == null){
            ApiResponse(HttpStatus.BAD_REQUEST, message = "Cep inválido ou inexistente")
        }
        else {
            ApiResponse(buscaCep)
        }
    }}