package com.sb.sdjpa.crud.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CustomerRequest {
    private String customerName;
    private int customerAge;
    private String customerMobileNumber;
    private String customerEmailAddress;
    private String customerAddress;
}
