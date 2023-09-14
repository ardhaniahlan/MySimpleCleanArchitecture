package org.apps.mysimplecleanarchitecture.di

import org.apps.mysimplecleanarchitecture.data.IMessageDataSource
import org.apps.mysimplecleanarchitecture.data.MessageDataSource
import org.apps.mysimplecleanarchitecture.data.MessageRepository
import org.apps.mysimplecleanarchitecture.domain.IMessageRepository
import org.apps.mysimplecleanarchitecture.domain.MessageInteractor
import org.apps.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}