package be.feelio.mollie.data.order;

import be.feelio.mollie.data.payment.PaymentResponse;
import be.feelio.mollie.data.refund.RefundResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEmbedded {

    private List<PaymentResponse> payments;

    private List<RefundResponse> refunds;

}
