package com.core_live.core.dtos;

import com.core_live.core.enums.QueryType;
import com.core_live.core.utils.validations.Validate;
import com.utils.enums.SystemCodeEnum;
import com.utils.exceptions.GlobalException;
import com.utils.interfaces.IGValidationDto;
import com.utils.models.CustomAlert;
import com.utils.services.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public record QueryDto(
        String keyLive,
        String queryType,
        String token
) implements IGValidationDto<Void> {
    private static final Logger LOG = LoggerFactory.getLogger(QueryDto.class);
    private static final String LOG_MESSAGE_FORMAT = "QueryDto - {} - : {}.";

    @Override
    public Void validate() throws GlobalException {
        LOG.info(LOG_MESSAGE_FORMAT, queryType, this);
        return switch (Utils.ifEnumGet(queryType, QueryType.class)) {
            case QUERY_GET_LIVE -> {
                Validate.key(keyLive);
                Validate.token(token);
                yield null;
            }
            case QUERY_GET_LIVE_STREAM -> {
                Validate.key(keyLive);
                yield null;
            }
            default -> {
                LOG.error("{} - Invalid query type.", SystemCodeEnum.C120PI.name());
                throw GlobalException.builder()
                        .status(400)
                        .alert(new CustomAlert(SystemCodeEnum.C120PI))
                        .build();
            }
        };
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String keyLive;
        private String queryType;
        private String token;

        public Builder keyLive(String keyLive) {
            this.keyLive = keyLive;
            return this;
        }

        public Builder queryType(String queryType) {
            this.queryType = queryType;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public QueryDto build() {
            return new QueryDto(keyLive, queryType, token);
        }
    }
}
