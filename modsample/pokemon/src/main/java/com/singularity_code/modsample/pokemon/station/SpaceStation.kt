package com.singularity_code.modsample.pokemon.station

import arrow.core.Either
import com.singularity_code.control.provider.sample.pokemon.PokemonSpaceStation
import com.singularity_code.control.provider.sample.pokemon.model.PokemonGem
import com.singularity_code.control.provider.sample.pokemon.payload.GetPokemonByIdSPLD
import com.singularity_code.core.common.model.VmError

class SpaceStation : PokemonSpaceStation {
    override suspend fun getPokemonById(
        payload: GetPokemonByIdSPLD
    ): Either<VmError, PokemonGem> {

        val pld = com.singularity_code
            .modsample
            .pokemon
            .data
            .payload
            .GPBIPLD(payload.id)

        return com.singularity_code
            .modsample
            .pokemon
            .data
            .getPokemonById(
                pld
            )
            .map {
                it.pokemon_v2_pokemon[0]
                    .let {
                        PokemonGem(
                            id = it.id.toString(),
                            name = it.name
                        )
                    }
            }
    }
}