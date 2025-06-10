package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SteckDecreased extends AbstractEvent {

    private Long id;
    private String name;
    private String stock;
    private String name;

    public SteckDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public SteckDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
