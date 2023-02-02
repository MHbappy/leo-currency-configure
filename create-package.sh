./mvnw clean install
docker rmi -f mhbappy18/currency_configure &>/dev/null && echo 'Removed old container'
docker build -t mhbappy18/currency_configure .
docker push mhbappy18/currency_configure
