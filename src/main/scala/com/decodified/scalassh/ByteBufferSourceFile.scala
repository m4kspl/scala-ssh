package com.decodified.scalassh

import java.io.{ ByteArrayInputStream, InputStream }

import net.schmizz.sshj.xfer.InMemorySourceFile

/**
 * Created by M4ks on 14/09/2015.
 */
class ByteBufferSourceFile(bytes: Array[Byte]) extends InMemorySourceFile {

  override def getLength: Long = bytes.length

  override def getName: String = "[bytebuffer]"

  override def getInputStream: InputStream = new ByteArrayInputStream(bytes)
}
