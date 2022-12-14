package pe.idat.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "hospedaje-microservicio", url="localhost:8091")
public class OpenFeignClient {

}
