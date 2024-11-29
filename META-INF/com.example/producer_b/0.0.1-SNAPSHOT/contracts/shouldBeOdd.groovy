package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return 'Odd' if the number is not divisible by 2"

    request {
        method 'GET'
        urlPath( '/prime-number') {
            queryParameters {
                parameter 'number': 5
            }
        }
    }

    response {
        status 200
        body(
                'Odd'
        )
        headers {
            contentType(textPlain())
        }
    }
}
