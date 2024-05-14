package in.raj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {
    private Integer ticketId;
    private String from;
    private String to;
    private String doj;
}
