scoreboard objectives add guardian_kills dummy

scoreboard players add @s guardian_kills 1

advancement revoke @s only istars-mob-pedestal:guardian_kill

execute as @s if score @s guardian_kills matches 50.. run give @s istars-mob-pedestal:guardian_soul 1

execute as @s if score @s guardian_kills matches 50.. run scoreboard players set @s guardian_kills 0