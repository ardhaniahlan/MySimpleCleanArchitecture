package org.apps.mysimplecleanarchitecture.data

import org.apps.mysimplecleanarchitecture.domain.MessageEntity

interface  IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}