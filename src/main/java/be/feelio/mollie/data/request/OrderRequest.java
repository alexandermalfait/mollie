package be.feelio.mollie.data.request;

import be.feelio.mollie.data.common.Amount;
import be.feelio.mollie.data.enums.Locale;
import be.feelio.mollie.data.enums.PaymentMethod;
import be.feelio.mollie.data.order.OrderAddressRequest;
import be.feelio.mollie.data.order.OrderLineRequest;
import be.feelio.mollie.serializer.PaymentMethodSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private Amount amount;

    private String orderNumber;

    private List<OrderLineRequest> lines;

    private OrderAddressRequest billingAddress;

    @Builder.Default
    private Optional<OrderAddressRequest> shippingAddress = Optional.empty();

    @Builder.Default
    private Optional<Date> consumerDateOfBirth = Optional.empty();

    @Builder.Default
    private Optional<String> redirectUrl = Optional.empty();

    @Builder.Default
    private Optional<String> webhookUrl = Optional.empty();

    private Locale locale;

    @Builder.Default
    @JsonSerialize(using = PaymentMethodSerializer.class)
    private Optional<List<PaymentMethod>> method = Optional.empty();

    private Map<String, Object> payment;

    private Map<String, Object> metaData;

    private Optional<Date> expiresAt;

    // OAuth Params
    @Builder.Default
    private Optional<String> profileId = Optional.empty();

    @Builder.Default
    private Optional<Boolean> testmode = Optional.empty();

}
