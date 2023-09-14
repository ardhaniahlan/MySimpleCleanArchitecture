package org.apps.mysimplecleanarchitecture.data

import org.apps.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
            MessageEntity("Hello $name! Welcome to Clean Architecture")
}