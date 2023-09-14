package org.apps.mysimplecleanarchitecture.data

import org.apps.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) =
        messageDataSource.getMessageFromSource(name)
}