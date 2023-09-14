package org.apps.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String) : MessageEntity
}