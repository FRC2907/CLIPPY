FROM python:3
WORKDIR /app
COPY *.py .
COPY requirements.txt .
RUN pip install -r requirements.txt

CMD python -u main.py

VOLUME /app/logs
