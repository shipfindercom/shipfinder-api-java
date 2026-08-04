# ELANE-sdk
[ELANE](https://www.shipfinder.com/)&nbsp;&nbsp;
[API Console](https://open.shipfinder.com/v1/console/overview)&nbsp;&nbsp;
[API Document](https://docs.shipfinder.com/)&nbsp;&nbsp;
[github](https://github.com/shipfinder/shipfinder-api-java)&nbsp;&nbsp;
[sonatype](https://central.sonatype.com/artifact/io.github.shipfinder/shipfinder-api)&nbsp;&nbsp;

## Usage example
```
<dependency>
    <groupId>io.github.shipfinder</groupId>
    <artifactId>shipfinder-api</artifactId>
    <version>1.0.0</version>
</dependency>
```
```
import com.elane.response.*;
import com.elane.api.Shipfinder;

public class Main {
    private static String key = "Please apply from the API console.";

    public static void main(String[] args) {
        ManyShipResponse result = Shipfinder.GetManyShip(key, "413961925,477232800,477172700");
        System.out.println(result);
    }
}

```

## If you have any questions during development, please contact us through the following channels:

• Email：shipfinder@elaneglobal.com
