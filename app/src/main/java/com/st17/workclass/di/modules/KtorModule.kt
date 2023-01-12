package com.st17.workclass.di.modules

import com.st17.workclass.model.ktor.KtorClient
import dagger.Module
import dagger.Provides

@Module
class KtorModule {
    @Provides
    fun provideKtorClient(): KtorClient {
        return KtorClient()
    }
}