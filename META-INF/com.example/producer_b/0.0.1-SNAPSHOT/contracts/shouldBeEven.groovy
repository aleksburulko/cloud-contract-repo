package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return 'Even' if the number is divisible by 2, otherwise 'Odd'"

    request {
        method 'GET'
        urlPath( '/prime-number') {
            queryParameters {
                parameter 'number': 10
            }
        }
    }

    response {
        status 200
        body(
                'Even'
        )
        headers {
            contentType(textPlain())
        }
    }
}
