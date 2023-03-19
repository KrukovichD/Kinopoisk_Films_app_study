package by.savushkin.study.geekbrains.kinopoisk_films.data.di

import android.content.Context
import by.savushkin.study.geekbrains.kinopoisk_films.data.network.KinopoiskApiRepositiryImp
import by.savushkin.study.geekbrains.kinopoisk_films.data.network.NetworkRepository
import by.savushkin.study.geekbrains.kinopoisk_films.data.repository.FilmRepositoryImpl
import by.savushkin.study.geekbrains.kinopoisk_films.data.storage.repository.FilmsStorage
import by.savushkin.study.geekbrains.kinopoisk_films.data.storage.repository.RoomStorageImpl
import by.savushkin.study.geekbrains.kinopoisk_films.domain.repository.FilmRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideRoomStorage(context: Context): FilmsStorage =
        RoomStorageImpl(context = context)


    @Provides
    fun provideNetworkRepository(): NetworkRepository =
        KinopoiskApiRepositiryImp()

    @Provides
    fun provideDataRepository(
        dataStorage: FilmsStorage,
        networkRepository: NetworkRepository
    ): FilmRepository {
        return FilmRepositoryImpl(
            filmsStorage = dataStorage,
            networkRepository = networkRepository
        )
    }
}

