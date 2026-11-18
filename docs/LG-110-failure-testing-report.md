# LG-110: Service Availability and Failure Testing Report

## 1. Normal Operation Results

| Service | HTTP Status | Health |
|---|---|---|
| Eureka Server | 200 | UP |
| Config Server | 200 | UP |
| API Gateway | 200 | UP |

## 2. Eureka Failure Results

- Stopped Eureka Server.
- Eureka health endpoint became inaccessible.
- API Gateway remained running with health UP.
- Restarted Eureka Server successfully.

## 3. Config Server Failure Results

- Stopped Config Server.
- Config health endpoint became inaccessible.
- API Gateway remained running with health UP.
- Restarted Config Server successfully.

## 4. Gateway Failure Results

- Before stopping Gateway, its health endpoint returned HTTP 503 with status DOWN due to the remote Eureka health indicator.
- Gateway route returned HTTP 200 and displayed the Eureka Dashboard.
- After stopping Gateway, its health endpoint became inaccessible.
- Restarted Gateway successfully.

## 5. Recovery Results

| Verification | Result |
|---|---|
| Eureka recovery | PASS |
| Config Server recovery | PASS |
| Gateway recovery | PASS |
| Gateway health after restart | HTTP 200 – UP |
| Gateway routing after restart | HTTP 200 |
| Eureka registration after recovery | API-GATEWAY – UP |

## 6. Observations

- Infrastructure services can remain running independently when another service becomes unavailable.
- Gateway health can report DOWN when its remote Eureka health indicator is unavailable.
- Eureka registration recovered after Gateway restarted.
- Gateway routing worked after recovery.

## 7. Conclusion

All assigned local failure and recovery scenarios were tested. All three infrastructure services recovered successfully, Eureka registration was restored, and Gateway routing worked after recovery.