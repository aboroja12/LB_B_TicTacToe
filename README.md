# LB_B_TicTacToe

# Änderungen zur Planung
- Als erstes wollte ich eine Notification machen, dass nach 20 Sekunden inaktivität eine
    Benachrichtigung kommt, jetzt habe ich aber eine andere Notification gemacht, wenn man auf den
    Reset-Button klickt bekommt man eine Benachrichtigung, dass das Game gereseted wurde.
    Aus diesem Grund habe ich auch einen Testfall im Testprotokoll geändert, um die neue Notification zu testen.
- Bei der Planung wollte ich einen Service machen für das Scoreboard, jedoch habe ich es dann doch 
    ohne Service gemacht.

# Zu Beachten
- Wenn die Notification getestet wird, ist es wichtig zu überprüfen das die Notifications an sind 
    auf dem Gerät für die App, dies kann man prüfen, in dem man länger auf die App drückt und dann
    auf App Info klickt und dort unter Notifications schauen dass die Benachrichtigungen aktiviert sind.

- Vibration kann nicht im Emulator getestet werden, sondern nur auf einem richtigen Gerät.


# Testen
  - Die App wurde im Emulator getestet
  - Die App wurde auf einem Samsung a50  getestet auf der die Version 11 drauf ist. Ebenso ist es 
  wichtig zu beachten, dass man beim testen die Vibrationen und Benachrichtigungen aktiviert hat.
  - Ebenso wurden noch EspressoTests gemacht.