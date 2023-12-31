package com.singularity_code.control.provider.sample.pokemon

import arrow.core.Either
import com.singularity_code.control.provider.sample.pokemon.model.PokemonGem
import com.singularity_code.control.provider.sample.pokemon.payload.GetPokemonByIdSPLD
import com.singularity_code.core.common.model.VmError
import com.singularity_code.core.common.pattern.navigation.SpaceStation

interface PokemonSpaceStation : SpaceStation {
    suspend fun getPokemonById(
        payload: GetPokemonByIdSPLD
    ): Either<VmError, PokemonGem>
}