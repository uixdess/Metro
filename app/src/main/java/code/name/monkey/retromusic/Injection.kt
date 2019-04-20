/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.monkey.retromusic

import code.name.monkey.retromusic.providers.RepositoryImpl
import code.name.monkey.retromusic.providers.interfaces.Repository
import code.name.monkey.retromusic.rest.KogouClient
import code.name.monkey.retromusic.rest.service.KuGouApiService
import code.name.monkey.retromusic.util.schedulers.BaseSchedulerProvider
import code.name.monkey.retromusic.util.schedulers.SchedulerProvider

object Injection {

    fun provideRepository(): Repository {
        return RepositoryImpl.instance
    }

    fun provideSchedulerProvider(): BaseSchedulerProvider {
        return SchedulerProvider.getInstance()
    }

    fun provideKuGouApiService(): KuGouApiService {
        return KogouClient().apiService
    }
}