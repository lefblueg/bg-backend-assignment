package com.marscolony.user.core.events;

import com.marscolony.user.core.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserUpdatedEvent {

    private String id;
    private User user;
}
