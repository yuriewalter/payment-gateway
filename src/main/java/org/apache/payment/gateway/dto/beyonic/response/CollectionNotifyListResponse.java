package org.apache.payment.gateway.dto.beyonic.response;

import lombok.*;

import java.util.List;

/**
 * @author Sanyam Goel created on 23/7/18
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CollectionNotifyListResponse {

    private long count;

    private String next;

    private String previous;

    private List<CollectionNotifyResponse> results;

}
