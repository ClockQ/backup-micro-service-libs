package consumer

import java.net.InetAddress
import java.util.Properties

import com.pharbers.kafka.common.kafka_config_obj
import com.pharbers.kafka.consumer.PharbersKafkaConsumer
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.scalatest.FunSuite

/**
  * @ ProjectName micro-service-libs.consumer.PharbersConsumerTests
  * @ author jeorch
  * @ date 19-6-11
  * @ Description: TODO
  */
class PharbersConsumerTests extends FunSuite {

    test("PharbersKafkaConsumer") {
        val pkc = new PharbersKafkaConsumer[String, Array[Byte]](kafka_config_obj.topics.toList, 1000, 3)
        val t = new Thread(pkc)
        t.start()
        Thread.sleep(50000)
        t.stop()
        println("DOWN")
    }

    def process[K, V](record: ConsumerRecord[K, V]): Unit = {
        println("===process>>>" + record.key() + ":" + record.value())
    }

}