scoreboard objectives add spider_kills dummy

scoreboard players add @s spider_kills 1

advancement revoke @s only istars-mob-pedestal:spider_kill

execute as @s if score @s spider_kills matches 50.. run give @s istars-mob-pedestal:spider_soul 1

execute as @s if score @s spider_kills matches 50.. run scoreboard players set @s spider_kills 0