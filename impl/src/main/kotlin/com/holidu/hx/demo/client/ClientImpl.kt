package com.holidu.hx.demo.client

import com.holidu.hx.demo.api.SomeInterface
import kotlinx.datetime.Instant

object ClientImpl : SomeInterface {
    override fun foo(): Instant = Instant.DISTANT_PAST
}
